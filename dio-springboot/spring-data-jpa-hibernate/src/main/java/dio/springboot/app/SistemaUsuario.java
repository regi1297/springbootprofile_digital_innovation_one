package dio.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springboot.app.model.Usuario;

@Component
public class SistemaUsuario implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("reginaldo@dio.com.br");
		usuario.setLogin("reginaldo");
		usuario.setNomeCompleto("REGINALDO MIRANDA");
		usuario.setSenha("diospringjpa");
		//repositório de persistência ??
	}
}
