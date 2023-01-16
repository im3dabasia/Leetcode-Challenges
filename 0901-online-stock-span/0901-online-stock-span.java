// class StockSpanner {
//     Stack<int[]> myStack = new Stack<>();
    
//     public int next(int price) {
//         int response = 1;
//         // int i = 0;
//         while (!myStack.isEmpty() && myStack.peek()[0] <= price) {
//             response += myStack.pop()[1];
//             // if(i == 0) System.out.println(myStack);

//             // i++;
//         }

        
//         myStack.push(new int[] {price, response});
//         return response;
//     }
// }

class StockSpanner {
    Stack<int[]> myStack = new Stack<>();
    
    public int next(int price) {
        int response = 1;
        
        while(!myStack.isEmpty() && myStack.peek()[0] <= price){
            response += myStack.pop()[1];
            System.out.println(response);
        }
        
        System.out.println(myStack.toString() + " " + price);
        myStack.push(new int[] {price, response});
        return response;
    }
}