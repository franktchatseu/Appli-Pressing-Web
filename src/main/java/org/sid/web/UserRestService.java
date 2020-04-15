package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.UserInterface;
import org.sid.entitie.User;
import org.sid.entitie.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//il faut que les requettes venant du serveur angular soit accepté
@CrossOrigin("http://localhost:4200")
public class UserRestService {
	@Autowired
	private UserInterface userinterface;
	/*@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<User> lists_users(){
		
		return userinterface.findAll();
	}*/
	
	//consulter un user
	@RequestMapping(value="/users/{id}",method = RequestMethod.GET)
	public Optional<Utilisateur> getuser(@PathVariable Long id) {
		
		return userinterface.findById(id);
	}
	//ajouter un user
	@RequestMapping(value="/users/save")
	public Utilisateur save_user(@RequestBody Utilisateur user) {
		
		return userinterface.save(user);
	}
	//methode pour la suppression d'un utilisateur
	@RequestMapping(value="/users/{id}")
	public boolean delete_user(@PathVariable Long id) {
		
		userinterface.deleteById(id);
		return true;
	}
	
	//methoude de mise a jour d'un user
	@RequestMapping(value="/users/{id}",method = RequestMethod.PUT)
	public Utilisateur update_user(@PathVariable Long id,@RequestBody Utilisateur user) {
		
		user.setId(id);
		return userinterface.save(user);
	}


	
}
