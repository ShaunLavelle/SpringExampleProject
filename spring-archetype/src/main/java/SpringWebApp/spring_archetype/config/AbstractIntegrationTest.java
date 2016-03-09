package SpringWebApp.spring_archetype.config;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
  DirtiesContextTestExecutionListener.class,
  DbUnitTestExecutionListener.class,
  TransactionDbUnitTestExecutionListener.class})
@DbUnitConfiguration(databaseConnection="dataSource")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class, JpaConfig.class, SecurityConfig.class})
public class AbstractIntegrationTest
{
  
} 
