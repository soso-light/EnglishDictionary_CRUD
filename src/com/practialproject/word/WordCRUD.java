package com.practialproject.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> list;
    Scanner s;
    /*
    >> 난이도(1,2,3) & 새 단어 입력 : 1 driveway
     */

    public WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.print(">>> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.print("\t뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("* 새 단어가 단어장에 추가되었습니다. *\n");
    }

    /* update
    >> 수정할 단어 검색 : pa
    ----------------------------------
    1 * parent 부모님
    2 * parrot 앵무새
    ----------------------------------
    > 수정할 번호 선택 : 1
    >> 뜻 입력 : 부모, 부모님
    ** 단어가 수정되었습니다 **
     */
    @Override
    public int update(Object obj) {
        return 0;
    }

    public void updateItem(){

    }

    /* delete
    >> 삭제할 단어 검색 : pa
    ----------------------------------
    1 * parent 부모, 부모님
    2 * parrot 앵무새
    ----------------------------------
    > 삭제할 번호 선택 : 1
    >> 정말로 삭제하시겠습니까(y/n)? 
    ** 단어가 삭제되었습니다 **
     */
    @Override
    public int delete(Object obj) {
        return 0;
    }

    public void deleteItem(){

    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll() {
        System.out.println("____________________________");
        for(int i=0; i< list.size(); i++) {
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("____________________________\n");
    }
}
