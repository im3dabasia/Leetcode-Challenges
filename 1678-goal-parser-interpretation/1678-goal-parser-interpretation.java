class Solution {
    public String interpret(String command) {
        StringBuilder temp = new StringBuilder(command);
        
        command  = command.replace("()","o");
        command  = command.replace("(al)","al");
        
        return command;
    }
}