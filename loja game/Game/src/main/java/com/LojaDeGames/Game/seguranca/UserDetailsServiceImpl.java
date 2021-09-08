package com.LojaDeGames.Game.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class UserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername (String userName) {
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(()-> new UsernameNotFoundException(userName + " not found."));
		
		return user.map(UserDetailslmpl ::new).get(); 
	}
	
}
