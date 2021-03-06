package sn.transfert.transfertRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.transfert.transfertRest.domaine.Transfert;

public interface ITransfert extends JpaRepository<Transfert, Integer>{

	//Query to verify duplication of codeTransfert
	public Transfert findByCodeTransfert(String code);
}
