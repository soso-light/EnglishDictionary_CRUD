package com.practialproject.word;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }

    private int selectMenu() {
        System.out.print("***** 영단어 마스터 *****\n"
            + "***********************\n"
            + "1. 모든 단어 보기\n"
            + "2. 수준별 단어 보기\n"
            + "3. 단어 검색\n"
            + "4. 단어 추가\n"
            + "5. 단어 수정\n"
            + "6. 단어 삭제\n"
            + "7. 단어 저장\n"
            + "0. 파일 종료\n"
            + "***********************\n"
            + ">> 원하는 메뉴는?\t");
        return s.nextInt();
    }

    /*
        switch (menu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                break;
            default: System.out.println("out of range. try again");
            break;
        }
    */

    public void start(){
        wordCRUD.loadFile();

        while (true){
            int menu = selectMenu();
            if(menu == 0){
                System.out.println("* 단어장 종료 *");
                break;
            }
            switch (menu){
                case 1: wordCRUD.listAll();
                    break;
                case 2: wordCRUD.searchLevel();
                    break;
                case 3: wordCRUD.searchWord();
                    break;
                case 4: wordCRUD.addItem();
                    break;
                case 5: wordCRUD.updateItem();
                    break;
                case 6: wordCRUD.deleteItem();
                    break;
                case 7: wordCRUD.saveFile();
                    break;
                default: System.out.println("!--!-- 범위를 벗어났습니다. 다시 입력하십시오. --!--!");
                    break;
            }
        }

    }
}
