/**
 * Created by jiangqin on 17/4/18.
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){
//        r
    }

    private static void rangeCheck(int arg, int max ,String name){
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof PhoneNumber))
            return false;

        PhoneNumber pn = (PhoneNumber)obj;
        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    private volatile int hashCode;

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0){
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }


    @Override
    public String toString() {
        return String.format("(%03d)%03d-%04d",areaCode,prefix,lineNumber);
    }
}
