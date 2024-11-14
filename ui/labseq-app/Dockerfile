FROM node:latest AS node
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:alpine
COPY --from=node /app/dist/labseq-app/* /usr/share/nginx/html/

EXPOSE 4200:80