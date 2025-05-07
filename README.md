# PecuNet
Planejamento Inicial do Sistema de Gerenciamento de Granja


1.Objetivo:
	Este projeto tem como principal objetivo auxiliar granjas de pequeno, médio e grande porte na centralização e organização de suas informações operacionais. O sistema permitirá o gerenciamento simultâneo de múltiplas granjas, divididas por galpões, proporcionando uma visão estruturada e eficiente de cada unidade produtiva.
A plataforma reunirá dados essenciais como médias de mortalidade, produção diária de ovos, condições ambientais (temperatura e umidade) e informações sanitárias. Será possível registrar e monitorar as vacinas aplicadas em cada lote de galinhas, permitindo o controle do cronograma de vacinação e a verificação do histórico de imunização de forma prática e precisa.
Essas informações poderão ser cruzadas para identificar padrões e antecipar possíveis problemas sanitários ou produtivos, contribuindo diretamente para o aumento da eficiência e da tomada de decisões estratégicas.
Pensado para atender diferentes realidades de conectividade, o sistema será disponibilizado em versão on-premise, com interfaces para desktop e mobile. Terá suporte ao modo offline-first (funcionamento local sem necessidade de internet) e modo em rede, possibilitando acesso multiusuário, sincronização de dados e backups automáticos.


2.Entidades:
	
    • Granja: Responsável por armazenar os dados de uma ou várias granjas pertencentes ao usuário, permitindo uma visão mais ampla e organizada de diferentes locais de produção.
    • Usuário: Entidade encarregada de guardar as informações pessoais dos usuários cadastrados no sistema, viabilizando o controle de acesso e a rastreabilidade de ações realizadas na plataforma.
    • Galpão: Representa a estrutura física dentro de uma granja. Permite o cadastro e gerenciamento dos galpões, incluindo o estado atual, os lotes alocados e o histórico de movimentações.
    • Lote_Galinha: Armazena informações sobre os lotes de galinhas, como dados relacionados ao nascimento, tempo de vida e histórico de movimentação entre galpões.
    • Registro_Ovo: Registra a quantidade diária de ovos coletados em cada galpão, com o objetivo de calcular médias de produção por lote ao longo do tempo.
    • Registro_Mortalidade: Responsável por registrar as mortes ocorridas durante o ciclo de vida das galinhas. Esses dados auxiliam na análise de causas e na avaliação da eficiência sanitária por lote ou galpão.
    • Vacina: Contém o cadastro das vacinas necessárias para os lotes de galinhas, incluindo informações relevantes para o controle sanitário.
    • Registro_Vacina: Registra a aplicação das vacinas em cada lote, permitindo o acompanhamento histórico e o cumprimento de cronogramas de vacinação.
    • Registro_Modificacao: Armazena todas as alterações realizadas por usuários no sistema, garantindo a rastreabilidade e o controle de auditoria das informações.
    • Condição Ambiental: Registra dados ambientais, como temperatura e umidade, de cada galpão em datas específicas. Essa entidade é fundamental para cruzar informações com registros de mortalidade e produção, auxiliando na identificação de possíveis causas de variações nos resultados.

3.Regras de negocio:
	
    • Permissões e hierarquia de acesso:
 O sistema deve possuir um controle de permissões baseado em níveis hierárquicos de usuários. Somente usuários com autorização adequada poderão visualizar ou modificar dados sensíveis, garantindo segurança e rastreabilidade das operações.

    • Validação de status dos galpões:
 A lógica do sistema deve impedir operações incoerentes com o estado atual dos galpões. Por exemplo, não será possível adicionar um lote em um galpão com capacidade máxima, em processo de limpeza ou em quarentena. Essas validações são cruciais para evitar falhas humanas e garantir a integridade dos dados operacionais.

    • Controle de entrada e saída de lotes:
 O sistema deve registrar a entrada e o destino de cada lote de galinhas. Isso inclui situações como venda, descarte por doenças ou transferência entre galpões. Esse rastreamento garante uma visão completa do histórico de movimentação de cada lote, facilitando auditorias e ações corretivas.

    • Monitoramento da produção de ovos:
 Deverá ser possível registrar a quantidade de ovos produzidos diariamente, permitindo o cálculo da média de produção por granja, galpão e lote. O sistema cruzará essas informações para detectar quedas de produtividade, sugerindo possíveis correlações com fatores como ambiente ou aplicação de vacinas. Também poderá emitir alertas quando houver uma redução significativa na média em relação a períodos anteriores.

    • Monitoramento da mortalidade:
 A aplicação armazenará registros de mortes por lote e galpão, calculando médias periódicas para facilitar análises históricas. O sistema emitirá alertas quando a taxa de mortalidade estiver acima do normal em comparação com meses anteriores, permitindo identificar rapidamente surtos ou problemas sanitários.

    • Gerenciamento de vacinas disponíveis:
 Será mantida uma base atualizada com as vacinas obrigatórias e opcionais recomendadas para as aves. Essa base servirá como referência para o produtor, com prazos, instruções de aplicação e alertas de atualização sempre que houver mudanças nas recomendações sanitárias.

    • Monitoramento da aplicação de vacinas:
 Cada aplicação de vacina deverá ser registrada e associada ao lote correspondente. O sistema verificará a conformidade com o calendário vacinal e alertará sobre vacinas pendentes ou atrasadas. Também poderá emitir advertências sobre riscos sanitários quando lotes estiverem com vacinas em falta.

    • Registro de modificações no sistema:
 O sistema registrará toda modificação feita em dados relevantes, informando o usuário responsável, data, hora e o conteúdo alterado. Essa função garante controle total sobre o histórico de alterações, sendo essencial para auditorias e investigações internas.

    • Monitoramento das condições ambientais:
 Serão armazenados dados como temperatura e umidade, por galpão e por dia. Esses dados podem ser inseridos manualmente ou coletados via sensores integrados. O sistema calculará médias e possibilitará o cruzamento com outros indicadores, como mortalidade e produção de ovos. Alertas serão gerados quando houver variações ambientais críticas, como excesso de calor em determinados dias ou queda drástica na umidade.

    • Alertas inteligentes e proativos:
 Com base nos dados registrados, o sistema será capaz de gerar alertas automáticos em diversas situações:
        ◦ Mortalidade acima da média em determinado mês.

        ◦ Queda na produção de ovos em um galpão específico.

        ◦ Lote ativo em galpão com status inadequado.

        ◦ Falta ou atraso na aplicação de vacina.
Esses alertas facilitarão a tomada de decisão rápida e aumentarão a eficiência da gestão da granja.



