import org.testng.annotations.DataProvider;

class Additions {

        @DataProvider(name = "summation")
        public Object additionData () {
            return new Object[][]{{1, 2, 3},
                    {2, 3, 4},
                    {3, 4, 5}
            };
        }
    }
