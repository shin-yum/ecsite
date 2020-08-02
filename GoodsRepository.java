package jp.com.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.com.internous.ecsite.model.entity.Goods;


public interface GoodsRepository extends JpaRepository<Goods,Long> {

}
