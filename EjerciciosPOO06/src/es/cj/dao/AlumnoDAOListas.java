package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.bean.Alumno;

public class AlumnoDAOListas implements AlumnoDAO {

	private List<Alumno> alumnos = new ArrayList<>();

	@Override
	public void anadir(Alumno a) {
		alumnos.add(a);
	}

	@Override
	public Alumno buscarPorNota(float nota) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNota_expediente() == nota)
				return alumnos.get(i);
		}
		return null;
	}

	@Override
	public Alumno buscarPorEdad(int edad) {
		for (Alumno alum : alumnos) {
			if (alum.getEdad() == edad)
				return alum;
		}
		return null;
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(nombre) 
					&& alumnos.get(i).getApellidos().equals(apellidos))
				alumnos.remove(i);
		}
	}

	@Override
	public void borrarTodos() {
		alumnos.clear();
	}

	@Override
	public Alumno cambiarNota(Alumno a, float nuevaNota) {
		for (Alumno alum : alumnos) {
			if (alum.equals(a)) {
				alum.setNota_expediente(nuevaNota);
				return alum;
			}
		}
		return a;
	}

	@Override
	public void mostrarTodos() {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

}
