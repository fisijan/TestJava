package mapper;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

import freemarker.core.Configurable;
import steps.TestSteps;

public class TestMapper extends JUnitStories{

	public TestMapper() {
		super();
		this.configuredEmbedder().candidateSteps().add(new TestSteps());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE,Format.STATS,Format.HTML));
	}
	
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("stories/Sample.story");
	}
}
