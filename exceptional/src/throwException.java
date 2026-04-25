public class throwException {
        void Adult ( int age) throws Exception {
            if (age < 18) {
                throw new Exception("enter a valid age");
            }
        }

}

// purpose of code is to generate a single exception
//  purpose of throws is to declare may or may not be show exception
// throws can declare only one exception
// throws can throw only one exception at one time
