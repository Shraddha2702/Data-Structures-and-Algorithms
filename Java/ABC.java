 class ABC{
        public static void main(String args[])
        {
            String X[] = {"m", "n", "p", "m", "p"};
            for (int i = 0; i < X.length; ++i)
                for (int j = i + 1; j < X.length; ++j)
                    if(X[i].compareTo(X[j]) == 0)
                System.out.print(X[j]);
            }
        }