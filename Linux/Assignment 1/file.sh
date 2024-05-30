LOG_FILE="Password.txt"


LOGIN_ATTEMPTS_FILE="login_attempts.txt"
ERROR_MESSAGES_FILE="error_messages.txt"


grep "Failed password" "$LOG_FILE" > "$LOGIN_ATTEMPTS_FILE"


awk '{print $9}' "$LOGIN_ATTEMPTS_FILE" | sed 's/invalid//g' | sort | uniq > "$ERROR_MESSAGES_FILE"

echo "Login attempts extracted to $LOGIN_ATTEMPTS_FILE"
echo "Error messages extracted to $ERROR_MESSAGES_FILE"
