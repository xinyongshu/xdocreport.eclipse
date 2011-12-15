package org.eclipse.nebula.widgets.pagination.renderers;

import org.eclipse.nebula.widgets.pagination.PaginationController;
import org.eclipse.nebula.widgets.pagination.renderers.graphics.BlackGraphicsPageConfigurator;
import org.eclipse.nebula.widgets.pagination.renderers.graphics.BlueGraphicsPageConfigurator;
import org.eclipse.nebula.widgets.pagination.renderers.graphics.GraphicsPageConfigurator;
import org.eclipse.nebula.widgets.pagination.renderers.graphics.GreenGraphicsPageConfigurator;
import org.eclipse.swt.widgets.Composite;

public class GraphicsPageRendererFactory implements PageRendererFactory {

	private static final PageRendererFactory BLUE_FACTORY = new GraphicsPageRendererFactory(
			BlueGraphicsPageConfigurator.getInstance());

	private static final PageRendererFactory GREEN_FACTORY = new GraphicsPageRendererFactory(
			GreenGraphicsPageConfigurator.getInstance());

	private static final PageRendererFactory BLACK_FACTORY = new GraphicsPageRendererFactory(
			BlackGraphicsPageConfigurator.getInstance());

	public static PageRendererFactory getBlueFactory() {
		return BLUE_FACTORY;
	}

	public static PageRendererFactory getGreenFactory() {
		return GREEN_FACTORY;
	}

	public static PageRendererFactory getBlackFactory() {
		return BLACK_FACTORY;
	}

	private final GraphicsPageConfigurator configurator;

	public GraphicsPageRendererFactory(GraphicsPageConfigurator configurator) {
		this.configurator = configurator;
	}

	public Composite createRenderer(PaginationController controller,
			Composite parent, int style) {
		return new ResultAndPageButtonsRenderer(controller, parent, style,
				configurator);
	}
}