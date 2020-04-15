package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.dao.UserInterface;
import org.sid.entitie.Client;
import org.sid.entitie.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserManagerApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx=  SpringApplication.run(UserManagerApplication.class, args);

		UserInterface userinterface;
		ClientRepository clientrepository=ctx.getBean(ClientRepository.class);
		userinterface=ctx.getBean(UserInterface.class);
		
		//insertion de quelques champs
		
		clientrepository.save(new Client("frank", "677124830", "koutaba"));
		clientrepository.save(new Client("Armand", "677124830", "Buea"));
		
		userinterface.save(new Utilisateur("Tchatseu", "frank", "louenkamfrank@gmail.com", "fj", "123", 1, "impressing.jpg"));
		userinterface.save(new Utilisateur("Komegne", "liliane", "liliane@gmail.com", "li", "123", 1, "impressing.jpg"));
		userinterface.save(new Utilisateur("Kamtchop", "line", "line@gmail.com", "line", "123", 1, "impressing.jpg"));
	}

}
