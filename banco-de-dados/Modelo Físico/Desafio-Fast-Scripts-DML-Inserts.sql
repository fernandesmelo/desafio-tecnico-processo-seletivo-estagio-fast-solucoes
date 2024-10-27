INSERT INTO `desafio_fast`.`colaboradores` (`nome`, `departamento`, `cargo`) VALUES 
('Laércio Fernandes', 'Desenvolvimento de Software FlowUp', 'Estágio Pessoa desenvolvedora Fullstack'),
('Ana Clara Silva', 'Marketing', 'Assistente de Marketing'),
('Pedro Almeida', 'Recursos Humanos', 'Analista de RH'),
('Mariana Costa', 'Desenvolvimento de Software FlowUp', 'Desenvolvedora Frontend'),
('Carlos Eduardo', 'Financeiro', 'Analista Financeiro'),
('Fernanda Lopes', 'Suporte Técnico', 'Analista de Suporte'),
('Ricardo Pereira', 'Desenvolvimento de Software FlowUp', 'Desenvolvedor Backend'),
('Julia Martins', 'Desenvolvimento de Software FlowUp', 'Estágio em QA'),
('Gabriel Santos', 'Design', 'Designer Gráfico'),
('Tatiane Souza', 'Vendas', 'Executiva de Vendas'),
('Felipe Rocha', 'Logística', 'Coordenador de Logística'),
('Bruna Nascimento', 'Desenvolvimento de Software FlowUp', 'Arquiteta de Software'),
('Roberto Lima', 'Desenvolvimento de Software FlowUp', 'Gerente de Projetos'),
('Juliana Dias', 'Compras', 'Analista de Compras'),
('André Mendes', 'Desenvolvimento de Software FlowUp', 'Estágio em Desenvolvimento de Aplicações'),
('Vanessa Costa', 'Qualidade', 'Analista de Qualidade');

INSERT INTO `desafio_fast`.`workshops` (`nome`, `data`, `descricao`, `local`, `hora_inicio`, `hora_fim`) VALUES
('Workshop de Inovação Tecnológica', '2024-01-11', 'Exploração de novas tecnologias e tendências de inovação.', 'Auditório Principal', '16:00:00', '17:00:00'),
('Workshop de Desenvolvimento Web', '2024-04-11', 'Técnicas e práticas para desenvolvimento de aplicações web modernas.', 'Laboratório 1', '16:00:00', '17:00:00'),
('Workshop de Inteligência Artificial', '2024-07-11', 'Introdução a conceitos de IA e suas aplicações.', 'Sala de Conferências', '16:00:00', '17:00:00'),
('Workshop de Segurança da Informação', '2024-10-10', 'Práticas de segurança para proteção de dados e sistemas.', 'Auditório Principal', '16:00:00', '17:00:00'),
('Workshop de Machine Learning', '2025-01-09', 'Conceitos básicos e aplicações de aprendizado de máquina.', 'Laboratório 2', '16:00:00', '17:00:00'),
('Workshop de Metodologias Ágeis', '2025-04-10', 'Introdução às metodologias ágeis, como Scrum e Kanban.', 'Sala de Reuniões', '16:00:00', '17:00:00'),
('Workshop de Cloud Computing', '2025-07-10', 'Uso e configuração de serviços de computação em nuvem.', 'Laboratório 3', '16:00:00', '17:00:00'),
('Workshop de Bancos de Dados', '2025-10-09', 'Tópicos avançados em gerenciamento de bancos de dados.', 'Sala de Conferências', '16:00:00', '17:00:00'),
('Workshop de Big Data', '2026-01-08', 'Trabalhando com grandes volumes de dados.', 'Auditório Principal', '16:00:00', '17:00:00'),
('Workshop de Desenvolvimento Mobile', '2026-04-09', 'Criando aplicativos para dispositivos móveis.', 'Laboratório 1', '16:00:00', '17:00:00'),
('Workshop de DevOps', '2026-07-09', 'Integração contínua e entrega contínua com DevOps.', 'Sala de Reuniões', '16:00:00', '17:00:00'),
('Workshop de Design de UX/UI', '2026-10-08', 'Fundamentos do design de experiência do usuário e interfaces.', 'Laboratório 2', '16:00:00', '17:00:00'),
('Workshop de Programação Funcional', '2027-01-14', 'Conceitos e práticas de programação funcional.', 'Laboratório 3', '16:00:00', '17:00:00'),
('Workshop de Arquitetura de Software', '2027-04-08', 'Boas práticas em design e arquitetura de software.', 'Sala de Conferências', '16:00:00', '17:00:00'),
('Workshop de Testes Automatizados', '2027-07-08', 'Estratégias para automatização de testes em aplicações.', 'Auditório Principal', '16:00:00', '17:00:00');

INSERT INTO `desafio_fast`.`ata_presenca` (`data_registro`, `observacoes`, `presente`, `feedbacks`, `Workshops_idWorkshops`) VALUES 
('2024-01-18', 'Participação ativa no workshop.', 1, 'Gostei bastante do conteúdo.', 1),
('2024-04-18', 'Tive dúvidas sobre o tema.', 1, 'Precisamos de mais exemplos práticos.', 2),
('2024-07-18', 'Workshop esclarecedor.', 1, 'Muito útil para o meu trabalho.', 3),
('2024-10-17', 'Importante para a equipe.', 1, 'Gostei das dicas de segurança.', 4),
('2025-01-16', 'Bons pontos levantados.', 1, 'DevOps é essencial!', 5),
('2025-04-17', 'Ótima abordagem sobre Git.', 1, 'Aprendi novas práticas.', 6),
('2025-07-17', 'Gostei da parte prática.', 1, 'Selenium facilitou meu trabalho.', 7);

