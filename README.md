# Implementación de un Sistema de Gestión de Pedidos con DDD

El objetivo es diseñar e implementar un sistema de gestión de pedidos para una tienda en línea, utilizando principios de Diseño Guiado por Dominio (DDD). El sistema debe manejar la creación, modificación y cancelación de pedidos, así como la gestión de inventario. Es crucial que el sistema refleje fielmente las reglas de negocio y los procesos del dominio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño Guiado por Dominio (DDD) |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado del Dominio

**Objetivo:** Identificar y definir los elementos clave del dominio para el sistema de gestión de pedidos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las entidades principales del dominio (pedidos, productos, clientes, etc.).
- Define las reglas de negocio asociadas a cada entidad.
- Considera los casos de uso principales para el sistema.

**Entregable:** Diagrama de contexto y reglas de negocio documentadas.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo las entidades interactúan entre sí.
- Reflexiona sobre las invariantes del dominio.

</details>

### Fase 2: Diseño de Agregados

**Objetivo:** Diseñar los agregados que estructurarán el dominio y garantizarán la consistencia de los datos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los agregados raíz en el dominio.
- Define las fronteras de los agregados y las relaciones entre ellos.
- Establece las invariantes que deben mantenerse dentro de cada agregado.

**Entregable:** Diagrama de agregados y definición de invariantes.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que un agregado debe ser una unidad de consistencia.
- Piensa en cómo las relaciones entre agregados afectan la consistencia del dominio.

</details>

### Fase 3: Implementación de Servicios de Dominio

**Objetivo:** Implementar servicios de dominio que encapsulen la lógica de negocio compleja.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica la lógica de negocio compleja que debe ser encapsulada en servicios de dominio.
- Diseña servicios de dominio que interactúen con los agregados para realizar operaciones complejas.
- Asegura que los servicios de dominio respeten las invariantes y reglas de negocio definidas.

**Entregable:** Descripción de servicios de dominio y cómo interactúan con los agregados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los servicios de dominio deben ser agnósticos a la persistencia.
- Piensa en cómo los servicios de dominio pueden ayudar a mantener la cohesión dentro del dominio.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los agregados en el contexto de DDD y por qué son importantes?
- **paraQueSirve**: ¿Para qué sirven los servicios de dominio en DDD y cómo se diferencian de los agregados?
- **comoSeUsa**: ¿Cómo se usan las invariantes para mantener la consistencia en los agregados?
- **erroresComunes**: ¿Cuáles son errores comunes al definir las fronteras de los agregados y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de servicios de dominio y cómo afecta esto al diseño del sistema?

## Criterios de Evaluacion

- Identificar y definir entidades y reglas de negocio del dominio.
- Diseñar agregados y establecer sus invariantes.
- Implementar servicios de dominio que encapsulen lógica de negocio compleja.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
