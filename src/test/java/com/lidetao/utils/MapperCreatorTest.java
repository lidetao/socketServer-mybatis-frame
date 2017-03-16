package com.lidetao.utils;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lidetao.dao.WikiBlockMapper;
import com.lidetao.dao.po.WikiBlock;
import com.lidetao.dao.po.WikiBlockExample;
import com.lidetao.utils.MapperCreator.ISQLExecutor;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MapperCreatorTest {

	@SuppressWarnings("resource")
	@Before
	public void init_conf() {
		new ClassPathXmlApplicationContext("applicationContext-dba.xml");
	}

	@Test
	public void test001selectOne() {

		WikiBlock block = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, WikiBlock>() {

					@Override
					public WikiBlock execute(WikiBlockMapper mapper) {
						Integer id = 1;
						return mapper.selectByPrimaryKey(id);
					}

				});

		Assert.assertNotNull(block);
		System.out.println(JsonUtil.toFormatJson(block));

	}

	@Test
	public void test002selectList() {
		List<WikiBlock> blockList = MapperCreator.exeMapper(
				WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, List<WikiBlock>>() {

					@Override
					public List<WikiBlock> execute(WikiBlockMapper mapper) {

						WikiBlockExample example = new WikiBlockExample();
						example.createCriteria().andFileEqualTo("index");

						return mapper.selectByExample(example);
					}

				});

		Assert.assertNotNull(blockList);
		System.out.println(JsonUtil.toFormatJson(blockList));
	}

	@Test
	public void test003insert() {
		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						WikiBlock record = new WikiBlock();
						record.setTheme("test");

						try {
							mapper.insertSelective(record);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		Assert.assertTrue(isOk);
	}

	@Test
	public void test004update() {

		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						WikiBlock record = new WikiBlock();
						record.setFile("testFile");

						WikiBlockExample example = new WikiBlockExample();
						example.createCriteria().andThemeEqualTo("test");

						try {
							mapper.updateByExampleSelective(record, example);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		Assert.assertTrue(isOk);

	}

	@Test
	public void test005delete() {

		Boolean isOk = MapperCreator.exeMapper(WikiBlockMapper.class,
				new ISQLExecutor<WikiBlockMapper, Boolean>() {

					@Override
					public Boolean execute(WikiBlockMapper mapper) {

						WikiBlockExample example = new WikiBlockExample();
						example.createCriteria().andThemeEqualTo("test");

						try {
							mapper.deleteByExample(example);
						} catch (Exception e) {
							return false;
						}

						return true;
					}
				});

		Assert.assertTrue(isOk);

	}
}
