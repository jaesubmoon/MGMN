package com.group7.MGMN.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.group7.MGMN.dao.IMarketDAO;
import com.group7.MGMN.model.MarketVO;
import com.group7.MGMN.model.PagingVO;
import com.group7.MGMN.model.QnAVO;

@Service
public class MarketService implements IMarketService {
	
	@Autowired
	@Qualifier("IMarketDAO")
	IMarketDAO dao;
	
	@Override
	public ArrayList<MarketVO> listRegionPost(String mkRegion) {
		return dao.listRegionPost(mkRegion);
	}

	@Override
	public ArrayList<MarketVO> listCtgPost(String ctgId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertPost(MarketVO mkVO) {
		dao.insertPost(mkVO);

	}

	@Override
	public void updatePost(MarketVO mkVO) {
		dao.updatePost(mkVO);

	}

	@Override
	public void deletePost(int mkNo) {
		dao.deletePost(mkNo);

	}

	@Override
	public MarketVO detailViewPost(int mkNo) {
		return dao.detailViewPost(mkNo);
	}

	@Override
	public ArrayList<MarketVO> mkSearchPost(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 페이징 (검색 추가)
	@Override
	public int countMkBoard() {
		return dao.countMkBoard();
	}
	@Override
	public List<MarketVO> selectMkBoard(PagingVO pagingvo) {
		return dao.selectMkBoard(pagingvo);
	}

}