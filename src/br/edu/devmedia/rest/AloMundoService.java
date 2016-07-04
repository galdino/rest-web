package br.edu.devmedia.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.devmedia.entity.Pessoa;
import br.edu.devmedia.util.Constantes;

@Path("/alo")
public class AloMundoService {
	
	@GET
	public String aloMundoGet(){
		return "Alo Mundo GET!";
	}
	
	@POST
	public String aloMundoPost(){
		return "Alo Mundo POST!";
	}
	
	@GET
	@Path("/alo2")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String aloMundoGet2(@QueryParam("msg") String msg){
		return "<h1>Alo Mundo GET 2: " + msg +"</h1>";
	}
	
	@GET
	@Path("/param")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String testeParam(@QueryParam("msg") String msg){
		return "Param: " + msg;
	}
	
	@POST
	@Path("/json")
	@Produces(Constantes.APPLICATION_JSON_UTF8)
	@Consumes(Constantes.APPLICATION_JSON_UTF8)
	public Pessoa testJson(Pessoa p){
//		System.out.println(abc);
//		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome(abc);
		System.out.println(p.getNome());
		p.setNome("Abraão");
		
		Map<String, Pessoa> irmaos = new HashMap<String, Pessoa>();
		
		List<Pessoa> filhos = new ArrayList<Pessoa>();
		for (int i = 1; i <= 5; i++) {
			Pessoa filho = new Pessoa();
			filho.setNome("Filho" + i);
			
			Pessoa irmao = new Pessoa();
			irmao.setNome("Ana");
			
			irmaos.put(String.valueOf(i), irmao);
			filhos.add(filho);
		}
		
		p.setFilhos(filhos);
		p.setIrmaos(irmaos);
		
		return p;
	}

}
