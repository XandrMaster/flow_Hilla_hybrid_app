package com.example.view.vaadin

import com.vaadin.flow.component.html.H1
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.server.auth.AnonymousAllowed
import jakarta.annotation.PostConstruct

@PageTitle("vaadinTest")
@Route(value = "/public/vaadin")
@AnonymousAllowed
class VaadinTest : VerticalLayout() {

	@PostConstruct
	fun postConstruct() {
		setSizeFull()
		justifyContentMode = FlexComponent.JustifyContentMode.CENTER
		defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
		style["text-align"] = FlexComponent.Alignment.CENTER.name

		val h1 = H1("Hello from Vaadin")
		add(h1)
	}
}