package cn.leijiba.game5;

import java.awt.event.ItemListener;
import java.util.*;

/**
 * @Author notfornothing
 * @Date 2021/3/23 23:13
 */
public class DouDiZhu {
    public static void main(String[] args) {
        Map<Integer, String> map = getNum();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        Set<Integer> integers = map.keySet();
        Iterator<Integer> it = integers.iterator();
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        int j=0;
        while (it.hasNext()) {
            it.next();
            all.add(j);
            j++;
        }
        Collections.shuffle(all);
        int size = all.size();
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
        showOwn(p1,map);
        showOwn(p2,map);
        showOwn(p3,map);
        showOwn(last,map);
    }

    private static void showOwn(ArrayList<Integer> p1,Map<Integer,String > map) {

        ArrayList<String> list = new ArrayList<>();
        for (Integer integer : p1) {
            list.add(map.get(integer));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list.size()+"=="+ list);

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
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < all.size(); i++) {
            map.put(i, all.get(i));
        }
        return map;
    }


}
