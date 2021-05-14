package secondDayhwork1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course();
		course1.id =1;
		course1.name= "Yazýlým Geliþtirici Geliþtirme Kampý (JAVA + REACT)";
		course1.instructor ="Engin Demiroð";
		course1.process= 45;
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Geliþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 50);
		
		User user1 = new User();
		user1.id=1;
		user1.name= "Büþra";
		user1.lastName= "Tüter";
		
		User user2 = new User(2, "Kübra", "Akýncý");
		
		Course[] courses = new Course [] {course1, course2};
		User[] users = new User [] {user1, user2};
		
		
		for (int i =0; i < courses.length; i++) {
			System.out.println("Kurs Adý: " + courses[i].name +
					" Eðitmen: " + courses[i].instructor + "Ýlerleme: " + courses[i].process);
	
		}

		for (User user: users) {
			System.out.println("Ad: " + user.name + " Soyad: " + user.lastName);
		}
		
		CourseManager courseManager =  new CourseManager();
		courseManager.Add(course1);
		courseManager.Remove(course2);
		
	}

}
