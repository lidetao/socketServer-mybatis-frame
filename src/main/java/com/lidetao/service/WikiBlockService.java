package com.lidetao.service;

import java.util.List;

import com.lidetao.action.vo.BlockVos.VoForInsertBlock;
import com.lidetao.action.vo.BlockVos.VoForListBlock;
import com.lidetao.action.vo.BlockVos.VoForUpdateBlock;
import com.lidetao.dao.WikiBlockMapper;
import com.lidetao.dao.po.WikiBlock;
import com.lidetao.dao.po.WikiBlockExample;
import com.lidetao.utils.MapperCreator;
import com.lidetao.utils.MapperCreator.ISQLExecutor;

/**
 * service层
 * 
 * @author Administrator
 *
 */
public class WikiBlockService {

	/**
	 * 获取一个对象
	 * 
	 * @param id
	 * @return
	 */
	public static WikiBlock getBlock(Integer id) {

		WikiBlock block = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, WikiBlock>() {

					@Override
					public WikiBlock execute(WikiBlockMapper mapper) {
						return mapper.selectByPrimaryKey(id);
					}

				});

		return block;

	}

	/**
	 * 获取对象列表
	 * 
	 * @param param
	 * @return
	 */
	public static List<WikiBlock> listBlock(VoForListBlock param) {
		List<WikiBlock> blockList = MapperCreator.exeMapper(
				WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, List<WikiBlock>>() {

					@Override
					public List<WikiBlock> execute(WikiBlockMapper mapper) {

						WikiBlockExample example = new WikiBlockExample();
						example.createCriteria()
								.andFileEqualTo(param.getFile());

						return mapper.selectByExample(example);
					}

				});

		return blockList;
	}

	/**
	 * 添加一个对象
	 * 
	 * @param param
	 * @return
	 */
	public static Boolean saveBlock(VoForInsertBlock param) {
		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						WikiBlock record = new WikiBlock();
						record.setTheme(param.getTheme());

						try {
							mapper.insertSelective(record);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		return isOk;
	}

	/**
	 * 更新一组对象
	 * 
	 * @param param
	 * @return
	 */
	public static Boolean updateBlock(VoForUpdateBlock param) {

		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						WikiBlock record = new WikiBlock();
						record.setFile(param.getFile());

						WikiBlockExample example = new WikiBlockExample();
						example.createCriteria().andThemeEqualTo(
								param.getTheme());

						try {
							mapper.updateByExampleSelective(record, example);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		return isOk;

	}

	/**
	 * 删除一个对象
	 * 
	 * @param id
	 * @return
	 */
	public static Boolean deleteBlock(Integer id) {

		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						try {
							mapper.deleteByPrimaryKey(id);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		return isOk;

	}

}
