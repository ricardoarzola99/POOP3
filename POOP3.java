package poop3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
public class POOP3 {
public static void main(String[] args){
    System.out.println("Arreglos");
    int [] nums;
    int nums1[];
    nums=new int [5];
    int [] nums2= {1,2,3,4,5};
        for (int i = 0; i < nums2.length; i++) {
            int o= nums2[i];
            System.out.println(o);
        }
        System.out.println("");
        System.out.println("Arreglos For each");
        for(int o : nums2){
            System.out.println(o);
        }
        System.out.println("");
        System.out.println("Manejo de Cadenas");
String s= new String("Hola Mundo");
        System.out.println(s);
String s1="Hola Mundo 2";
        System.out.println(s1);;
        System.out.println("");
        System.out.println("Operador punto");
System.out.println("nums2.length= " + nums2.length);
System.out.println("s length= " +s.length());
System.out.println("s length= " +s1.length());
System.out.println("");
    System.out.println("Concatenación");
String nombre="Ricardo";
String apellido="Arzola";
String nc=nombre  +  apellido;
System.out.println(nc); 
    System.out.println("");
    System.out.println("Wrappers");
Integer k= new Integer(22);
Integer l=22;
int r=2+l;
System.out.println(r);
String entero=l+"";
String entero1=l.toString();
System.out.println(entero1);
System.out.println("");
    System.out.println("Arreglos dinámicos");
ArrayList<Integer>miArrayList= new ArrayList<Integer>();
miArrayList.add(50);
miArrayList.add(22);
for(Integer elemento: miArrayList){
System.out.println(elemento);}
System.out.println("");
System.out.println("Arreglo añadiendo números");
miArrayList.add(0,3);
miArrayList.add(2,99);
for(Integer elemento: miArrayList){
System.out.println(elemento);}
System.out.println("Tamaño ArrayList: "+miArrayList.size());   
System.out.println("Elemento 2: "+miArrayList.get(2));
System.out.println("");
System.out.println("Hash Table");
Hashtable<String,Integer>miTabla=new Hashtable<String,Integer>(); 
miTabla.put("uno",1);
miTabla.put("dos",2);
miTabla.put("tres",3);
System.out.println("¿La tabla contiene a siete? "+miTabla.containsKey("siete"));
System.out.println("El tamaño de la tabla es: "+miTabla.size());
for(Integer valor: miTabla.values()){
System.out.println(valor);}
for(String clave : miTabla.keySet()){
System.out.println(clave);}
String clave;
Integer valor;
Enumeration<String> claves=miTabla.keys();
while(claves.hasMoreElements()){
clave=claves.nextElement();
valor=miTabla.get(clave);
System.out.println("Clave: "+clave+", Valor: "+valor);
}
System.out.println("");
System.out.println("Math");
System.out.println(Math.pow(3,2));
System.out.println(Math.sqrt(9));
System.out.println(Math.PI);
System.out.println("");
System.out.println("Date");
Date hoy= new Date();
System.out.println(hoy);
System.out.println("");
System.out.println("Calendario");
Calendar calendarioHoy=Calendar.getInstance();
System.out.println(calendarioHoy);
SimpleDateFormat formatoFecha=new SimpleDateFormat("u-dd-MM-yyyy");
System.out.println(formatoFecha.format(hoy));
String fechaActual="Hoy es el día ";
fechaActual +=calendarioHoy.get(Calendar.DAY_OF_MONTH)+" del mes ";
fechaActual +=calendarioHoy.get(Calendar.MONTH)+" del año ";
fechaActual +=calendarioHoy.get(Calendar.YEAR);
System.out.println("Fecha de hoy");
System.out.println(fechaActual);
System.out.println("");
System.out.println("Diccionario");
Hashtable<String,String>dic=new Hashtable<String,String>(); 
dic.put("coacción","presión, fuerza o violencia de tipo físico psíquico o moral que se ejerce sobre una persona para obligarla a que haga o diga algo contra su voluntad");
dic.put("admonición","discurso con que se hace ver un mal y se invita a corregirse");
dic.put("sobreseimiento"," tipo de resolución judicial que dicta un juez o tribunal, supendiendo un proceso por falta de causas que justifiquen la acción de la justicia");
dic.put("anexión","proceso generalmente violento, por el cual un Estado o país se apodera de otro, destruyendo, trasladando o integrando todas o parte de sus instituciones");
dic.put("circunspección","seriedad o reserva de una persona al hablar o acturar, para comportarse comedidamente");
String clave1;
String valor1;
Enumeration<String> claves1=dic.keys();
while(claves1.hasMoreElements()){
clave1=claves1.nextElement();
valor1=dic.get(clave1);
System.out.println("Palabra: "+clave1+", Significado: "+valor1);}
System.out.println("");
System.out.println("Agenda");
Hashtable<String,String>agenda=new Hashtable<String,String>(); 
Calendar fecha =  GregorianCalendar.getInstance();
fecha.add(Calendar.YEAR,- 20);
Calendar fecha1 =  Calendar.getInstance();
fecha1.add(Calendar.YEAR,-30);
Calendar fecha2 =  Calendar.getInstance();
fecha2.add(Calendar.YEAR,-44);
Calendar fecha3 =  Calendar.getInstance();
fecha3.add(Calendar.YEAR,-33);
Calendar fecha4 =  Calendar.getInstance();
fecha4.add(Calendar.YEAR,-25);
String str=fecha.toString();
String str1=fecha1.toString();
String str2=fecha2.toString();
String str3=fecha3.toString();
String str4=fecha4.toString();
agenda.put("Ricardo Arzola",fecha.getTime().toLocaleString());
agenda.put("Roberto Rodríguez",fecha1.getTime().toLocaleString());
agenda.put("Erick Rodríguez",fecha2.getTime().toLocaleString());
agenda.put("Yael Valdez",fecha3.getTime().toLocaleString());
agenda.put("Antonio Carrillo",fecha4.getTime().toLocaleString());
String clave2;
String valor2;
Enumeration<String> claves2=agenda.keys();
while(claves2.hasMoreElements()){
clave2=claves2.nextElement();
valor2=agenda.get(clave2);
System.out.println("Nombre: "+clave2+", Cumpleaños: "+valor2);}}}
