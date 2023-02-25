package org.example.Seminar4.cw.Ex6;

//https://leetcode.com/problems/simplify-path/
public class Ex6 {
//    class Solution {
//        public String simplifyPath(String path) {
//            Stack<String> stack = new Stack<>();
//            StringBuilder ans= new StringBuilder();
//
//            String[] tokens = path.split("/");
//            for (String token:tokens) {
//                if("..".equals(token)){
//                    if(!stack.isEmpty()){
//                        stack.pop();
//                    }
//                } else if(!".".equals(token) && !token.isBlank()){
//                    stack.push(token);
//                }
//
//            }
//            if (stack.isEmpty()) return "/";
//
//            while (!stack.isEmpty()){
//                ans.insert(0,stack.pop()).insert(0,"/");
//            }
//            return ans.toString();
//        }
//    }

//    Deque<String> list = new LinkedList<>();
//    String[] arr = path.split("/");
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i].equals("") || arr[i].equals(".")) continue;
//        else if (arr[i].equals("..")) {
//            if (!list.isEmpty()) list.pop();
//        }else list.add(arr[i]);
//    }
//        return "/" + String.join("/", list);

}
