class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            String str = operations[i];
            char ch = str.charAt(0);
            if(Character.isDigit(ch)  || ch=='-'){
                stack.push(Integer.parseInt(str));
            }
            else if(!stack.isEmpty()){
                if(ch == '+' && stack.size()>1){
                    int a = stack.pop();
                    int b = stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                }
                else if(ch == 'D'){
                    int a = stack.peek();
                    stack.push(a*2);
                }
                else if(ch=='C'){
                    stack.pop();
                }
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}