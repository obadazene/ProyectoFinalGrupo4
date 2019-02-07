package service;

import java.util.List;



@service
@Transacional
public class Servicios implements IServicios {

	private IRepositorioCustom userRepository;

	@Override
	public List<Persona> list() {
		return userDAO.findAll();
	}

	@Override
	public User get(int id) {
		return userRepository.findOne(id);
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		userRepository.delete(id);
	}

}
