package com.example.giga_test;

import chat.giga.client.GigaChatClient;
import chat.giga.client.auth.AuthClient;
import chat.giga.client.auth.AuthClientBuilder;
import chat.giga.model.ModelName;
import chat.giga.model.Scope;
import chat.giga.model.completion.ChatMessage;
import chat.giga.model.completion.ChatMessageRole;
import chat.giga.model.completion.CompletionRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GigaTestApplication {
	public static void main(String[] args) {
		/*
		GigaChatClient client = GigaChatClient.builder()
				.verifySslCerts(false)
				.authClient(AuthClient.builder()
						.withOAuth(AuthClientBuilder.OAuthBuilder.builder()
								.scope(Scope.GIGACHAT_API_PERS)
								.authKey("MDE5YTUzODgtMWJhYy03NTA3LTlmMDgtODE0MzQyNTM5YmUwOjVhMDY0YmIyLWZmMTUtNDM2Mi05MTc5LTQzYjhjNWQzZDk1Mw==")
								.build())
						.build())
				.build();

		System.out.println(client.completions(CompletionRequest.builder()
				.model(ModelName.GIGA_CHAT_MAX)
				.message(ChatMessage.builder()
						.content("Почему мой парень самый прекрасный?")
						.role(ChatMessageRole.USER)
						.build())
				.build()));

		 */
	}
}
