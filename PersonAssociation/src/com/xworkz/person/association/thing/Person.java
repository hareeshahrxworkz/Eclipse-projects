package com.xworkz.person.association.thing;

public class Person {

	public String name;
	public Email[] emails;
	public Job job;

	

	public void setPerson(String name,Email[] email, Job job) {
		this.emails = email;
		this.job = job;
		this.name=name;
	}

	public void display() {
		System.out.println("Person printing naditha ede");
		System.out.println(this.name);

		if (this.emails != null) {
			for (int i = 0; i < this.emails.length; i++) {
				Email email = this.emails[i];
				if (email != null) {
					email.display();

				}
			}

			if (job != null)

			{

				job.display();
			}

		}

	}

}
