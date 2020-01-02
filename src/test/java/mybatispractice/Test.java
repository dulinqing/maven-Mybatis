package mybatispractice;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.foxconn.dao.IUserDao;
import com.foxconn.model.Staff;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sqlSessionFactory.openSession();
//		List<Staff> staffList = session.selectList("com.foxconn.dao.IUserDao.findAllUser");
		IUserDao userDao=session.getMapper(IUserDao.class);
		List<Staff> staffList=userDao.findAllUser();
		for (Staff staffone : staffList) {
			System.out.println(staffone);
		}
		session.close();
		inputStream.close();
	}

}
