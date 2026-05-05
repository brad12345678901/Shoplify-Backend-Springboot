package DTO;

public record APIResponse<T>(
        int status,
        boolean success,
        String message,
        T data
) {
}
