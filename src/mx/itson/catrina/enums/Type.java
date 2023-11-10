/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.catrina.enums;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Luis Guerrero, Marco Lopez, Adlemi Duarte, Jonathan Felix.
 */
public enum Type {
    //Serealización para que detecte las variables "Deposit", "WHITDRAW."
  @SerializedName ("1")
       DEPOSIT,
  @SerializedName ("2")
     WHITDRAW
   
}
