package com.practialproject.word;

public class WordCRUD implements ICRUD {
    ArrayList<List> list;
    /*
    >> 난이도(1,2,3) & 새 단어 입력 : 1 driveway
     */

    public WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.println(">>> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.next();
        System.out.println("\t뜻 입력 : ");
        string meaning = s.nextLine();
        System.out.println(">>> ");

        return null;
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
