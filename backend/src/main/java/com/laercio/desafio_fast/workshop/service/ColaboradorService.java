// package com.laercio.desafio_fast.workshop.service;

// import com.laercio.desafio_fast.workshop.model.Colaborador;
// import com.laercio.desafio_fast.workshop.repository.ColaboradorRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class ColaboradorService {

//     @Autowired
//     private ColaboradorRepository colaboradorRepository;

//     public List<Colaborador> listarColaboradores() {
//         return colaboradorRepository.findAll();
//     }

//     public Colaborador salvarColaborador(Colaborador colaborador) {
//         return colaboradorRepository.save(colaborador);
//     }

//     public Colaborador atualizarColaborador(int idColaboradores, Colaborador colaborador) {
//         colaborador.setIdColaboradores(idColaboradores);
//         return colaboradorRepository.save(colaborador);
//     }

//     public void deletarColaborador(int idColaboradores) {
//         colaboradorRepository.deleteById(idColaboradores);
//     }
// }
