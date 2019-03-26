package com.bridgelabz.Singleton.DesignPatterns;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestSingletonPattern 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		int eager=EagerInitializedSingleton.getInstance().hashCode();
		System.out.println("Hash code of eager initialized instance 1 : "+eager);
		int eager1=EagerInitializedSingleton.getInstance().hashCode();
		System.out.println("Hash code of eager initialized instance 2 : "+eager1);
		System.out.println("----------------------------------------------------------------");
		int lazy1=LazyInitializedSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of lazy initialized instance 1 : "+lazy1);
		int lazy2=LazyInitializedSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of lazy initialized instance 2 : "+lazy2);
		System.out.println("----------------------------------------------------------------");
		int statc=StaticBlockSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of static block singleton pattern instance 1 : "+statc);
		int statc1=StaticBlockSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of static block singleton pattern instance 2 : "+statc1);
		System.out.println("----------------------------------------------------------------");
		int bill=BillPughSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of Bill Pugh singleton pattern instance 1 : "+bill);
		int bill1=BillPughSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of Bill Pugh singleton pattern instance 2 : "+bill1);
		System.out.println("----------------------------------------------------------------");
		int thread=ThreadSafeSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of Thread safe singleton pattern instance 1 : "+thread);
		int thread1=ThreadSafeSingletonPattern.getInstance().hashCode();
		System.out.println("Hash code of Thread safe singleton pattern instance 2 : "+thread1);
		System.out.println("----------------------------------------------------------------");
		int enum1=EnumSingletonPattern.INSTANCE.hashCode();
		int enum2=EnumSingletonPattern.INSTANCE.hashCode();
		int enum3=EnumSingletonPattern.START.hashCode();
		int enum4=EnumSingletonPattern.START.hashCode();
		System.out.println("Hash code of enum singleton (INSTANCE 1)"+enum1);
		System.out.println("Hash code of enum singleton (INSTANCE 2)"+enum2);
		System.out.println("Hash code of enum singleton (START 1)"+enum3);
		System.out.println("Hash code of enum singleton (START 2)"+enum4);
		System.out.println("----------------------------------------------------------------");
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hash code of eager initialized instance : "+instanceOne.hashCode());
        System.out.println("Hash code of reflection : "+instanceTwo.hashCode());
        System.out.println("----------------------------------------------------------------");
        SerializedSingleton instanceOne1 = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/admin1/eclipse-workspace/bridgelabz/filename.ser"));
        out.writeObject(instanceOne1);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("/home/admin1/eclipse-workspace/bridgelabz/filename.ser"));
        SerializedSingleton instanceTwo2 = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne1.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo2.hashCode());
        
   
    }
}