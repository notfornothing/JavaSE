package cn.leijiba.game5;

import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/23 23:13
 */
public class DouDiZhu {
    public static void main(String[] args) {

        Map<Integer, String> map = getNum();
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        Set<Integer> integers = map.keySet();
        Iterator<Integer> it = integers.iterator();
        ArrayList<String> all = new ArrayList<>();

        ArrayList<String> last = new ArrayList<>();
        while (it.hasNext()) {
            all.add(map.get(it.next()));
        }
        int size = map.size();
            for (int i = 0; i < size; i++) {
                if (size - i <= 3) {
                    last.add(all.get(i));
                }
                if (i % 3 == 0) {
                    p1.add(all.get(i));
                }
                if (i % 3 == 1) {
                    p2.add(all.get(i));
                }
                if (i % 3 == 2) {
                    p3.add(all.get(i));
                }

        }

        showNum(p1,p2,p3,last);
    }

    private static void  showNum(ArrayList<String> p1, ArrayList<String> p2, ArrayList<String> p3, ArrayList<String> last) {

        System.out.println("==========================");
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(last);
        System.out.println(p1.size()+"=="+p1);
        System.out.println(p2.size()+"=="+p2);
        System.out.println(p3.size()+"=="+p3);
        System.out.println(last.size()+"=="+last);
    }

    private static Map<Integer,String> getNum() {

        char[] chars ={'1','2','3','4','5','6','7','8','9','J','K','Q','A'};
        String[] colors = {"黑桃", "梅花", "方块", "红心"};

        ArrayList<String> colorsss = new ArrayList<>(Arrays.asList(colors));
        ArrayList<Character> numbers = new ArrayList<Character>();
        for (char aChar : chars) {
            numbers.add(aChar);
        }
        ArrayList<String> all = new ArrayList<>();
        for (int i = 0; i < colorsss.size(); i++) {
            for (int i1 = 0; i1 < numbers.size(); i1++) {
                all.add(colorsss.get(i) + numbers.get(i1));
            }
        }
        all.add("大王");
        all.add("小王");
        System.out.println(all);
        Collections.shuffle(all);
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < all.size(); i++) {
            map.put(i, all.get(i));
        }
        System.out.println(all);
        return map;
    }


}
