package test;

/**
 * Created by eason on 2017/4/27.
 */
class Enum {
    static String s = "-";

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            try {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    s += "ic ";
                }
                throw new Exception();
            } catch (Exception x) {
                s += "mc ";
            } finally {
                s += "mf ";
            }
        } finally {
            s += "of ";
        }
        System.out.println(s);
    }
}
