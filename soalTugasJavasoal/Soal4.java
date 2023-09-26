/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_tugas;

/**
 *
 * @author agus
 */
public class Soal4 {
    
    public void Jawaban4(){
        int i;
        for(i=1; i<=100; i++){
            if (i % 3 == 0 || i % 4 == 0){
                System.out.println("X");
            }else
                System.out.println(i);
        }
    }
}
