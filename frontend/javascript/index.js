// Dados simulados
let colaboradores = [
    { id: 1, nome: 'Alice Silva' },
    { id: 2, nome: 'Bruno Santos' },
    { id: 3, nome: 'Carlos Almeida' },
  ];
  
  let workshops = [
    {
      id: 1,
      nome: 'Workshop de JavaScript',
      dataRealizacao: '2024-10-01',
      descricao: 'Introdução ao desenvolvimento com JavaScript.',
      colaboradoresPresentes: [1, 2],
    },
    {
      id: 2,
      nome: 'Workshop de CSS Avançado',
      dataRealizacao: '2024-11-15',
      descricao: 'Técnicas avançadas de estilização com CSS.',
      colaboradoresPresentes: [2, 3],
    },
  ];
  
  // Funções para manipulação de dados
  function carregarColaboradores(filtro = '') {
    const lista = document.getElementById('colaboradores-lista');
    lista.innerHTML = '';
    colaboradores
      .filter(colaborador => colaborador.nome.toLowerCase().includes(filtro.toLowerCase()))
      .forEach(colaborador => {
        const item = document.createElement('li');
        item.classList.add('list-group-item');
        item.textContent = `${colaborador.nome} (ID: ${colaborador.id})`;
        lista.appendChild(item);
      });
  }
  
  function carregarWorkshops(filtro = '') {
    const lista = document.getElementById('workshops-lista');
    lista.innerHTML = '';
    workshops
      .filter(workshop => workshop.nome.toLowerCase().includes(filtro.toLowerCase()))
      .forEach(workshop => {
        const item = document.createElement('li');
        item.classList.add('list-group-item');
        item.textContent = `${workshop.nome} - ${workshop.dataRealizacao}`;
        item.addEventListener('click', () => mostrarDetalhesWorkshop(workshop.id));
        lista.appendChild(item);
      });
  }
  
  function mostrarDetalhesWorkshop(workshopId) {
    const workshop = workshops.find(w => w.id === workshopId);
    if (workshop) {
      const info = document.getElementById('workshop-info');
      const colaboradoresNomes = workshop.colaboradoresPresentes
        .map(id => colaboradores.find(c => c.id === id)?.nome || 'Desconhecido')
        .join(', ');
      info.innerHTML = `
        <strong>Nome:</strong> ${workshop.nome}<br>
        <strong>Data:</strong> ${workshop.dataRealizacao}<br>
        <strong>Descrição:</strong> ${workshop.descricao}<br>
        <strong>Colaboradores Presentes:</strong> ${colaboradoresNomes}
      `;
      document.getElementById('workshop-detalhes').style.display = 'block';
    }
  }
  
  function fecharDetalhes() {
    document.getElementById('workshop-detalhes').style.display = 'none';
  }
  
  // Função para filtrar colaboradores e workshops
  document.getElementById('filtro-colaboradores').addEventListener('input', (e) => {
    carregarColaboradores(e.target.value);
  });
  
  document.getElementById('filtro-workshops').addEventListener('input', (e) => {
    carregarWorkshops(e.target.value);
  });
  
  // Função para salvar colaboradores
  document.getElementById('form-colaborador').addEventListener('submit', (e) => {
    e.preventDefault();
    const id = parseInt(document.getElementById('colaborador-id').value);
    const nome = document.getElementById('colaborador-nome').value;
    
    if (id) {
      // Editar colaborador existente
      const colaborador = colaboradores.find(c => c.id === id);
      if (colaborador) colaborador.nome = nome;
    } else {
      // Adicionar novo colaborador
      const novoId = colaboradores.length ? Math.max(...colaboradores.map(c => c.id)) + 1 : 1;
      colaboradores.push({ id: novoId, nome });
    }
  
    document.getElementById('form-colaborador').reset();
    carregarColaboradores();
  });
  
  // Função para salvar workshops
  document.getElementById('form-workshop').addEventListener('submit', (e) => {
    e.preventDefault();
    const id = parseInt(document.getElementById('workshop-id').value);
    const nome = document.getElementById('workshop-nome').value;
    const dataRealizacao = document.getElementById('workshop-data').value;
    const descricao = document.getElementById('workshop-descricao').value;
    
    if (id) {
      // Editar workshop existente
      const workshop = workshops.find(w => w.id === id);
      if (workshop) {
        workshop.nome = nome;
        workshop.dataRealizacao = dataRealizacao;
        workshop.descricao = descricao;
      }
    } else {
      // Adicionar novo workshop
      const novoId = workshops.length ? Math.max(...workshops.map(w => w.id)) + 1 : 1;
      workshops.push({
        id: novoId,
        nome,
        dataRealizacao,
        descricao,
        colaboradoresPresentes: []
      });
    }
  
    document.getElementById('form-workshop').reset();
    carregarWorkshops();
  });
  
  // Inicialização
  carregarColaboradores();
  carregarWorkshops();
  