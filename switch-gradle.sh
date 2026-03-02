#!/bin/bash

services=(
    "user_service"
    "url_shortener_service"
    "project_service"
    "notification_service"
    "achievement_service"
    "analytics_service"
    "post_service"
    "account_service"
    "payment_service"
)

for service in "${services[@]}"; do
    echo "========================================="
    echo "🔄 Обновляю Gradle в $service до 7.6"
    echo "========================================="
    
    cd "/Users/annaantashkova/ITCommunicationPlatform/$service" || continue
    ./gradlew wrapper --gradle-version=7.6 --distribution-type=bin
    
    echo "✅ Готово: $service"
    echo ""
done

echo "🎉 Все сервисы обновлены до Gradle 7.6"#!/bin/bash

services=(
    "user_service"
    "url_shortener_service"
    "project_service"
    "notification_service"
    "achievement_service"
    "analytics_service"
    "post_service"
    "account_service"
    "payment_service"
)

for service in "${services[@]}"; do
    echo "========================================="
    echo "🔄 Обновляю Gradle в $service до 7.6"
    echo "========================================="
    
    cd "/Users/annaantashkova/ITCommunicationPlatform/$service"
    ./gradlew wrapper --gradle-version=7.6 --distribution-type=bin
    
    echo "✅ Готово: $service"
    echo ""
done

echo "🎉 Все сервисы обновлены до Gradle 7.6"



