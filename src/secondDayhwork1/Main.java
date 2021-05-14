package secondDayhwork1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		course1.id =1;
		course1.name= "Yaz�l�m Geli�tirici Geli�tirme Kamp� (JAVA + REACT)";
		course1.instructor ="Engin Demiro�";
		course1.process= 45;
		
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Geli�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 50);
		
		User user1 = new User();
		user1.id=1;
		user1.name= "B��ra";
		user1.lastName= "T�ter";
		
		User user2 = new User(2, "K�bra", "Ak�nc�");
		
		Course[] courses = new Course [] {course1, course2};
		User[] users = new User [] {user1, user2};
		
		
		for (int i =0; i < courses.length; i++) {
			System.out.println("Kurs Ad�: " + courses[i].name +
					" E�itmen: " + courses[i].instructor + "�lerleme: " + courses[i].process);
	
		}

		for (User user: users) {
			System.out.println("Ad: " + user.name + " Soyad: " + user.lastName);
		}
		
		CourseManager courseManager =  new CourseManager();
		courseManager.Add(course1);
		courseManager.Remove(course2);
		
	}

}
