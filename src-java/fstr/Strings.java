package fstr;

import clojure.lang.AFn;
import clojure.lang.IFn;
import clojure.lang.ISeq;

public class Strings {

    public static IFn strFn = new AFn() {
        @Override
        public String call() {
            return "";
        }

        @Override
        public String invoke() {
            return "";
        }

        @Override
        public String invoke(Object arg1) {
            return arg1 == null ? "" : arg1.toString();
        }

        @Override
        public String invoke(Object arg1, Object arg2) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString());
        }


        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15, Object arg16) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15, Object arg16, Object arg17) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString()) +
                    (arg17 == null ? "" : arg17.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString()) +
                    (arg17 == null ? "" : arg17.toString()) +
                    (arg18 == null ? "" : arg18.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18,
                             Object arg19) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString()) +
                    (arg17 == null ? "" : arg17.toString()) +
                    (arg18 == null ? "" : arg18.toString()) +
                    (arg19 == null ? "" : arg19.toString());
        }

        @Override
        public String invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
                             Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12,
                             Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18,
                             Object arg19, Object arg20) {
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString()) +
                    (arg17 == null ? "" : arg17.toString()) +
                    (arg18 == null ? "" : arg18.toString()) +
                    (arg19 == null ? "" : arg19.toString()) +
                    (arg20 == null ? "" : arg20.toString());
        }

        @Override
        public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7,
                             Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13,
                             Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19,
                             Object arg20, Object... args) {
            StringBuilder sb = new StringBuilder();
            for (Object x : args) {
                if (x != null) {
                    sb.append(x.toString());
                }
            }
            return (arg1 == null ? "" : arg1.toString()) +
                    (arg2 == null ? "" : arg2.toString()) +
                    (arg3 == null ? "" : arg3.toString()) +
                    (arg4 == null ? "" : arg4.toString()) +
                    (arg5 == null ? "" : arg5.toString()) +
                    (arg6 == null ? "" : arg6.toString()) +
                    (arg7 == null ? "" : arg7.toString()) +
                    (arg8 == null ? "" : arg8.toString()) +
                    (arg9 == null ? "" : arg9.toString()) +
                    (arg10 == null ? "" : arg10.toString()) +
                    (arg11 == null ? "" : arg11.toString()) +
                    (arg12 == null ? "" : arg12.toString()) +
                    (arg13 == null ? "" : arg13.toString()) +
                    (arg14 == null ? "" : arg14.toString()) +
                    (arg15 == null ? "" : arg15.toString()) +
                    (arg16 == null ? "" : arg16.toString()) +
                    (arg17 == null ? "" : arg17.toString()) +
                    (arg18 == null ? "" : arg18.toString()) +
                    (arg19 == null ? "" : arg19.toString()) +
                    (arg20 == null ? "" : arg20.toString()) + sb.toString();
        }

        @Override
        public Object applyTo(ISeq arglist) {
            StringBuilder sb = new StringBuilder();
            while (arglist != null) {
                var x = arglist.first();
                if (x != null) {
                    sb.append(x.toString());
                }
                arglist = arglist.next();
            }
            return sb.toString();
        }
    };
}