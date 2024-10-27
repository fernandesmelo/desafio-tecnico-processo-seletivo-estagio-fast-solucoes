let colaboradores = [
  {
    id: 1,
    nome: "Laércio Fernandes",
    departamento: "Desenvolvimento FlowUp",
    cargo: "Estagiário Fullstack",
  },
  {
    id: 2,
    nome: "Ana Clara Silva",
    departamento: "Marketing",
    cargo: "Assistente de Marketing",
  },
  {
    id: 3,
    nome: "Pedro Almeida",
    departamento: "Recursos Humanosp",
    cargo: "Analista de RH",
  },
];

let workshops = [
  {
    id: 1,
    nome: "Workshop de Inovação Tecnológica",
    dataRealizacao: "11/01/2024",
    descricao: "Exploração de novas tecnologias e tendências de inovação.",
    local: "Auditório Principal",
    horarioInicio: "16:00:00",
    horarioFim: "17:00:00",
    colaboradoresPresentes: [1, 2],
  },
  {
    id: 2,
    nome: "Workshop de Desenvolvimento Web",
    dataRealizacao: "11/04/2024",
    descricao: "Técnicas e práticas para desenvolvimento de aplicações web modernas.",
    local: "Laboratório 1",
    horarioInicio: "16:00:00",
    horarioFim: "17:00:00",
    colaboradoresPresentes: [2, 3],
  },
  {
    id: 3,
    nome: "Workshop de Inteligência Artificial",
    dataRealizacao: "11/07/2024",
    descricao: "Introdução a conceitos de IA e suas aplicações.",
    local: "Sala de Conferências",
    horarioInicio: "16:00:00",
    horarioFim: "17:00:00",
    colaboradoresPresentes: [3, 1],
  },
];

function carregarColaboradores(filtro = "") {
  const lista = document.getElementById("colaboradores-lista");
  lista.innerHTML = "";
  colaboradores
    .filter((colaborador) =>
      colaborador.nome.toLowerCase().includes(filtro.toLowerCase())
    )
    .forEach((colaborador) => {
      const item = document.createElement("li");
      item.classList.add("list-group-item");
      item.textContent = `${colaborador.nome} - ${colaborador.departamento} | ${colaborador.cargo}`;
      lista.appendChild(item);
    });
}

function carregarWorkshops(filtro = "") {
  const lista = document.getElementById("workshops-lista");
  lista.innerHTML = "";
  workshops
    .filter((workshop) =>
      workshop.nome.toLowerCase().includes(filtro.toLowerCase())
    )
    .forEach((workshop) => {
      const item = document.createElement("li");
      item.classList.add("list-group-item");
      item.textContent = `${workshop.nome} - ${workshop.dataRealizacao}`;
      item.addEventListener("click", () =>
        mostrarDetalhesWorkshop(workshop.id)
      );
      lista.appendChild(item);
    });
}

function mostrarDetalhesWorkshop(workshopId) {
  const workshop = workshops.find((w) => w.id === workshopId);
  if (workshop) {
    const info = document.getElementById("workshop-info");
    const colaboradoresNomes = workshop.colaboradoresPresentes
      .map(
        (id) => colaboradores.find((c) => c.id === id)?.nome || "Desconhecido"
      )
      .join(", ");
    info.innerHTML = `
        <strong>Nome:</strong> ${workshop.nome}<br>
        <strong>Data:</strong> ${workshop.dataRealizacao}<br>
        <strong>Descrição:</strong> ${workshop.descricao}<br>
        <strong>Local:</strong> ${workshop.local}<br>
        <strong>Horário Icício:</strong> ${workshop.horarioInicio}<br>
        <strong>Horário Fim:</strong> ${workshop.horarioFim}<br>
        <strong>Colaboradores Presentes:</strong> ${colaboradoresNomes}<br>
      `;
    document.getElementById("workshop-detalhes").style.display = "block";
  }
}

function fecharDetalhes() {
  document.getElementById("workshop-detalhes").style.display = "none";
}

document
  .getElementById("filtro-colaboradores")
  .addEventListener("input", (e) => {
    carregarColaboradores(e.target.value);
  });

document.getElementById("filtro-workshops").addEventListener("input", (e) => {
  carregarWorkshops(e.target.value);
});

document.getElementById("form-colaborador").addEventListener("submit", (e) => {
  e.preventDefault();
  const id = parseInt(document.getElementById("colaborador-id").value);
  const nome = document.getElementById("colaborador-nome").value;
  const departamento = document.getElementById(
    "colaborador-departamento"
  ).value;
  const cargo = document.getElementById("colaborador-cargo").value;

  if (id) {
    const colaborador = colaboradores.find((c) => c.id === id);
    if (colaborador) colaborador.nome = nome;
  } else {
    const novoId = colaboradores.length
      ? Math.max(...colaboradores.map((c) => c.id)) + 1
      : 1;
    colaboradores.push({ id: novoId, nome, departamento, cargo });
  }

  document.getElementById("form-colaborador").reset();
  carregarColaboradores();
});

document.getElementById("form-workshop").addEventListener("submit", (e) => {
  e.preventDefault();
  const id = parseInt(document.getElementById("workshop-id").value);
  const nome = document.getElementById("workshop-nome").value;
  const dataRealizacao = document.getElementById("workshop-data").value;
  const descricao = document.getElementById("workshop-descricao").value;
  const local = document.getElementById("workshop-local").value;
  const horarioInicio = document.getElementById("workshop-horario-inicio").value;
  const horarioFim = document.getElementById("workshop-horario-fim").value;

  if (id) {
    const workshop = workshops.find((w) => w.id === id);
    if (workshop) {
      workshop.nome = nome;
      workshop.dataRealizacao = dataRealizacao;
      workshop.descricao = descricao;
      workshop.local = local;
      workshop.horarioInicio = horarioInicio;
      workshop.horarioFim = horarioFim;
    }
  } else {
    const novoId = workshops.length
      ? Math.max(...workshops.map((w) => w.id)) + 1
      : 1;
    workshops.push({
      id: novoId,
      nome,
      dataRealizacao,
      descricao,
      local,
      horarioInicio,
      horarioFim,
      colaboradoresPresentes: [],
    });
  }

  document.getElementById("form-workshop").reset();
  carregarWorkshops();
});

carregarColaboradores();
carregarWorkshops();
