# Projeto API REST - Spotify

Este projeto implementa uma API REST para gerenciar playlists de músicas e artistas. É possível criar, atualizar, deletar e buscar playlists e artistas, além de adicionar músicas às playlists.

## Modelos

### Artista
- **id**: Identificador único do artista.
- **nome**: Nome do artista.
- **generos**: Lista de gêneros musicais do artista.
- **descricao**: Descrição do artista.
- **musicas**: Lista de músicas do artista.

### Playlist
- **id**: Identificador único da playlist.
- **nome**: Nome da playlist.
- **generos**: Lista de gêneros da playlist.
- **artistas**: Lista de artistas relacionados à playlist.
- **musicas**: Lista de músicas da playlist.

## Endpoints

### Playlists

- **GET /playlists**
    - Retorna todas as playlists.
    - **Exemplo de resposta:**
      ```json
      {
        "1": {
          "id": 1,
          "nome": "Minha Playlist Favorita",
          "generos": ["Pop"],
          "artistas": ["Bruno Mars", "Michael Jackson"],
          "musicas": ["Die With a Smile", "Love Never Felt So Good"]
        }
      {
        "2": {
          "id": 2,
          "nome": "Minha Nova Playlist",
          "generos": ["Rock"],
          "artistas": [],
          "musicas": []
        }
      }
      
      ```

- **GET /playlists/{id}**
    - Retorna uma playlist específica pelo ID.
    - **Exemplo de resposta:**
      ```json
      {
       "id": 1,
          "nome": "Minha Playlist Favorita",
          "generos": ["Pop"],
          "artistas": ["Bruno Mars", "Michael Jackson"],
          "musicas": ["Die With a Smile", "Love Never Felt So Good"]
      }
      ```

- **POST /playlists**
    - Cria uma nova playlist.
    - **Exemplo de requisição:**
      ```json
      {
        "nome": "Minha Nova Playlist",
        "generos": ["Rock"]
      }
      ```
    - **Exemplo de resposta:**
      ```json
      {
        "id": 2,
        "nome": "Minha Nova Playlist",
        "generos": ["Rock"],
        "artistas": [],
        "musicas": []
      }
      ```

- **PUT /playlists/{id}**
    - Atualiza uma playlist existente pelo ID.
    - **Exemplo de requisição:**
      ```json
      {
        "nome": "Playlist Atualizada",
        "generos": ["Jazz"]
      }
      ```

- **DELETE /playlists/{id}**
    - Deleta uma playlist pelo ID.
    - **Exemplo de resposta:** `204 No Content`


- **POST /playlists/{id}/musicas**
    - Adiciona uma nova música à playlist.
    - **Exemplo de requisição:**
      ```json
      "Nova Música"
      ```
    - **Exemplo de resposta:**
      ```json
      {
        "id": 1,
        "nome": "Minha Playlist",
        "generos": ["Pop"],
        "artistas": [],
        "musicas": ["Nova Música"]
      }
      ```

### Artistas

- **GET /artistas**
    - Retorna todos os artistas.
    - **Exemplo de resposta:**
      ```json
      {
        "1": {
          "id": 1,
          "nome": "Matue",
          "generos": ["Rap", "Trap"],
          "descricao": "Artista de Rap e Trap.",
          "musicas": ["O SOM", "333"]
        }
      }
      ```

- **GET /artistas/{id}**
    - Retorna um artista específico pelo ID.
    - **Exemplo de resposta:**
      ```json
      {
        "id": 1,
        "nome": "Matue",
        "generos": ["Rap", "Trap"],
        "descricao": "Artista de Rap e Trap.",
        "musicas": ["O SOM", "333"]
      }
      ```

- **POST /artistas**
    - Cria um novo artista.
    - **Exemplo de requisição:**
      ```json
      {
        "nome": "Novo Artista",
        "generos": ["Hip Hop"],
        "descricao": "Artista de Hip Hop.",
        "musicas": ["Música 1", "Música 2"]
      }
      ```
    - **Exemplo de resposta:**
      ```json
      {
        "id": 2,
        "nome": "Novo Artista",
        "generos": ["Hip Hop"],
        "descricao": "Artista de Hip Hop.",
        "musicas": ["Música 1", "Música 2"]
      }
      ```

- **PUT /artistas/{id}**
    - Atualiza um artista existente pelo ID.
    - **Exemplo de requisição:**
      ```json
      {
        "nome": "Artista Atualizado",
        "generos": ["Pop"],
        "descricao": "Artista de Pop.",
        "musicas": ["Música A", "Música B"]
      }
      ```

- **DELETE /artistas/{id}**
    - Deleta um artista pelo ID.
    - **Exemplo de resposta:** `204 No Content`
