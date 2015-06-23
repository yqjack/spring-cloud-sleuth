package org.springframework.cloud.sleuth.trace.receiver;

import org.springframework.cloud.sleuth.trace.Span;
import org.springframework.cloud.sleuth.trace.SpanReceiver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Spencer Gibb
 */
public class ArrayListSpanReceiver implements SpanReceiver {
	private final ArrayList<Span> spans = new ArrayList<>();

	@Override
	public void receiveSpan(Span span) {
		spans.add(span);
	}

	public List<Span> getSpans() {
		return spans;
	}

	@Override
	public void close() throws IOException {

	}
}
