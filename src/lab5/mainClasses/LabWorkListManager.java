package lab5.mainClasses;

import lab5.storedClasses.LabWork;
import lab5.storedClasses.Difficulty;
import lab5.storedClasses.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.io.FileWriter;
public class LabWorkListManager{
	private static ArrayList<LabWork> list;
	private static java.time.LocalDate creationDate;
	public static void init(ArrayList<LabWork> list1){
		if(list==null){
			list=list1;
			creationDate=java.time.LocalDate.now();
		}
		else
			System.out.println("ArrayList already exists");
	}
	
	public static void append(LabWork lw){
		list.add(lw);
	}
	
	public static void set(int id, LabWork lw){list.set(id, lw);}
	
	public static void remove(int id){

		try{list.remove(id);}
		catch(IndexOutOfBoundsException e){
			System.out.println("this index doesnt exists");
		}
	}
	
	public static void clear(){
		Person.clearPassportBase();
		list.clear();
	}
	
	public static void save(String way){
		try (var fw = new FileWriter(way)) {
			fw.write(toJson());
		} catch (Exception e) {
			System.out.println("bad file name");
		}
	}
	
	//compares minimalPoint field value
	public static void addIfMax(LabWork lw){
		boolean flag=true;
		for(LabWork labwork: list)
			if(labwork.getMinimalPoint()>lw.getMinimalPoint())flag=false;
		if(flag)append(lw);
	}
	
	public static void RemoveGreater(float val){
		for(int i=0;i<list.size();i++)
			if(list.get(i).getMinimalPoint()>val)remove(i);
	}
	
	public static void FilterByDescription(String description){
		for(int i=0;i<list.size();i++)
			if(list.get(i).getDescription().equals(description))System.out.println(list.get(i).toString()+"\n");
	}
	
	public static void printFieldAscendingDifficulty(){
		for(Difficulty diff:Difficulty.values())
			for(int i=0;i<list.size();i++)
				if(list.get(i).getDifficulty()==diff)System.out.println(list.get(i).toString()+"\n");
	}
	
	public static void printMinByName(){
		if(list.size()!=0){
			LabWork lw=list.get(0);
			for(int i=1;i<list.size();i++)
				if(lw.getName().length()>list.get(i).getName().length())lw=list.get(i);
			System.out.println(lw.toString());
		}
	}
	
	public static void sort(){
		Collections.sort(list);
	}
	
	public static String getCollectionInfo(){
		return "Collection info:[size:"+list.size()+", type:"+list.getClass()+", init date:"+creationDate+"]";
	}
	public static String getCollectionAsString(){
		if(list.size()==0)return "list is empty";
		String ret="";
		for (LabWork value : list) {
			ret+=(value.toString()+"\n\n");
		}
		return ret;
	}
	public static String toJson(){
		String ret="{\n\"LabWorks\": [\n";
		for(int i=0;i<list.size()-1;i++)
			ret+=list.get(i).toJson()+",\n";
		ret+=list.get(list.size()-1).toJson()+"\n]\n}";
		return ret;
	}
}