package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/*
 * 商品管理服务
 */

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
